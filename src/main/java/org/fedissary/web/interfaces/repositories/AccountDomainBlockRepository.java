package org.fedissary.web.interfaces.repositories;
import java.util.UUID;
import org.fedissary.web.entities.AccountDomainBlock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountDomainBlockRepository extends JpaRepository<AccountDomainBlock, UUID> {}