package com.jcr.monoservices.domain.specification;

import com.jcr.monoservices.domain.model.Company;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Join(path = "users", alias = "u")
@And({
        @Spec(path = "name", params = "name", spec = Like.class),
        @Spec(path = "u.id", params = "userId", spec = Equal.class)
})
public interface CompanySpec extends Specification<Company> {
}
