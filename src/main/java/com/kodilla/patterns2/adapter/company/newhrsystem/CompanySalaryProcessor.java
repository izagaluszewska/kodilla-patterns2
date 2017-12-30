package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CompanySalaryProcessor implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        BigDecimal baseSalarySum = employees.stream()
                .map(Employee::getBaseSalary)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return baseSalarySum;
    }
}
