package com.sdcuike.practice.domain;

import java.util.Date;

public class Company {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.company_oid
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private String companyOid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.name
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.logo_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private Long logoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.created_by
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private String createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.created_date
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private Date createdDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.done_register_lead
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private Boolean doneRegisterLead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.tax_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    private String taxId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.id
     *
     * @return the value of company.id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.id
     *
     * @param id the value for company.id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.company_oid
     *
     * @return the value of company.company_oid
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public String getCompanyOid() {
        return companyOid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.company_oid
     *
     * @param companyOid the value for company.company_oid
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setCompanyOid(String companyOid) {
        this.companyOid = companyOid == null ? null : companyOid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.name
     *
     * @return the value of company.name
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.name
     *
     * @param name the value for company.name
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.logo_id
     *
     * @return the value of company.logo_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public Long getLogoId() {
        return logoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.logo_id
     *
     * @param logoId the value for company.logo_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setLogoId(Long logoId) {
        this.logoId = logoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.created_by
     *
     * @return the value of company.created_by
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.created_by
     *
     * @param createdBy the value for company.created_by
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.created_date
     *
     * @return the value of company.created_date
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.created_date
     *
     * @param createdDate the value for company.created_date
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.done_register_lead
     *
     * @return the value of company.done_register_lead
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public Boolean getDoneRegisterLead() {
        return doneRegisterLead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.done_register_lead
     *
     * @param doneRegisterLead the value for company.done_register_lead
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setDoneRegisterLead(Boolean doneRegisterLead) {
        this.doneRegisterLead = doneRegisterLead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.tax_id
     *
     * @return the value of company.tax_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public String getTaxId() {
        return taxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.tax_id
     *
     * @param taxId the value for company.tax_id
     *
     * @mbg.generated Tue Apr 11 15:11:59 CST 2017
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId == null ? null : taxId.trim();
    }
}