package com.eazybytes.eazyschool.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrecntAuditor(){
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication().getName(0));
    }
}
