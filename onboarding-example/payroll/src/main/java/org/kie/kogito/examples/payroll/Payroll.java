/*
 *  Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.kie.kogito.examples.payroll;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Payroll implements java.io.Serializable {

    static final long serialVersionUID = 1L;

	private java.math.BigDecimal vacationDays;
	private java.math.BigDecimal taxRate;
	private String paymentDate;
	
	private org.kie.kogito.examples.payroll.Employee employee;

    public org.kie.kogito.examples.payroll.Employee getEmployee() {
        return employee;
    }

    public void setEmployee(org.kie.kogito.examples.payroll.Employee employee) {
        this.employee = employee;
    }

	public Payroll() {
	}

	public java.math.BigDecimal getVacationDays() {
		return this.vacationDays;
	}

	public void setVacationDays(java.math.BigDecimal vacationDays) {
		this.vacationDays = vacationDays;
	}

	public java.math.BigDecimal getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(java.math.BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public String getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Payroll(java.math.BigDecimal vacationDays, java.math.BigDecimal taxRate,
	               String paymentDate) {
		this.vacationDays = vacationDays;
		this.taxRate = taxRate;
		this.paymentDate = paymentDate;
	}
}