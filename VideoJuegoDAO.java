package org.example;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class VideoJuegoDAO implements DAO<VideoJuegos>{
    private DataSource datasource;
    public VideoJuegoDAO(DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public Optional<VideoJuegos> save(VideoJuegos videoJuegos) {
        return Optional.empty();
    }

    @Override
    public Optional<VideoJuegos> update(VideoJuegos videoJuegos) {
        return Optional.empty();
    }

    @Override
    public Optional<VideoJuegos> delete(VideoJuegos videoJuegos) {
        return Optional.empty();
    }

    @Override
    public List<VideoJuegos> findAll() {
        return List.of();
    }

    @Override
    public Optional<VideoJuegos> findById(Integer id) {
        return Optional.empty();
    }
}
