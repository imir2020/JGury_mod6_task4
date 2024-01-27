package by.javagury.spring.mapper;

import by.javagury.spring.database.entity.Company;
import by.javagury.spring.dto.CompanyDto;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CompanyMapper {

    public CompanyDto companyToDto(Company company) {
        return CompanyToDtoMapper.INSTANCE.fromCompanyToDto(company);
    }
}
