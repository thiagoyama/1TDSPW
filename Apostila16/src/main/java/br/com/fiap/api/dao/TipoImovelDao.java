package br.com.fiap.api.dao;

import br.com.fiap.api.model.TipoImovel;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class TipoImovelDao {

    private static final String INSERT_SQL = "insert into t_api_tipo_imovel (cd_tipo, nm_tipo, dt_cadastro) " +
            " values (sq_t_api_tipo_imovel.nextval, ?, ?)";

    private DataSource dataSource;

    public TipoImovelDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void cadastrar(TipoImovel tipo) throws SQLException {
        try(Connection conexao = dataSource.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(INSERT_SQL, new String[] {"cd_tipo"})){
            stmt.setString(1, tipo.getNome());
            stmt.setObject(2, tipo.getDataCadastro());
            stmt.executeUpdate();

            ResultSet resultSet = stmt.getGeneratedKeys();
            if (resultSet.next()) {
                tipo.setCodigo(resultSet.getInt(1));
            }
        }
    }

}
