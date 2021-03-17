package ifrn.pi.almoxarifado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.almoxarifado.models.Almoxarifado;

public interface ObjetosRepository extends JpaRepository <Almoxarifado, Long> {

}
