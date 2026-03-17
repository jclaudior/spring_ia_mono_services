package com.jcr.monoservices.domain.specification;

import com.jcr.monoservices.domain.model.Invite;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Join(path = "company", alias = "c")
@And({
        @Spec(path = "email", params = "email", spec = Like.class),
        @Spec(path = "c.id", params = "companyId", spec = Equal.class)
})
public interface InviteSpec extends Specification<Invite> {
}
