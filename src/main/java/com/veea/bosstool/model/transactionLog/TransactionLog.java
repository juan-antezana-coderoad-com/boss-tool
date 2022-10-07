/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.veea.bosstool.model.transactionLog;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TransactionLog extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TransactionLog\",\"namespace\":\"avro.transactionLog\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"veeaMerchantId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"transactionType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"request\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RequestType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"acquireInstId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"addPOS\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cardMasked\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"creditEMD\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"currencyCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"entryMode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"fee\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"localDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"localTime\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantAddress\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"messageType\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"posConCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"processingCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"retrievalRrefNum\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sysTraceAuditNum\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"terminalId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"transmissionTimeDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"vantivTransactionData\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"vantivTransactionDataBinaryBitmap\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"vantivTransactionDataBitmap\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"year\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"taxRate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"totalTaxAmount\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"response\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ResponseType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"authCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"creditEMD\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"localDate\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"localTime\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"responseCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sysTraceAuditNum\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"terminalId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"transmissionTimeDate\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"statusDetails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"StatusDetailsType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"transactionStatusType\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"transactionStatusStatus\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"linkedTransactionLog\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"error\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"timestamp\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"emafS3Url\",\"type\":[\"null\",\"string\"],\"default\":null}]},\"default\":[]}],\"default\":null},{\"name\":\"additionalReceiptData\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AdditionalReceiptDataType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"applicationId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"phoneNumber\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cardNetworkName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"chipIndicator\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cvm\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"integratedCircuitData\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"rawResponseStringKICC\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantStAdd\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantCity\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantState\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"merchantCountry\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"veeaTicket\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"VeeaTicketType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"veeaMerchantId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"createdAtDateTime\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"veeaTicketItemDetail\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"VeeaTicketItemDetailType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"inventoryItemId\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"cost\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"taxPercentage\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"note\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"quantity\",\"type\":[\"null\",\"double\"],\"default\":null}]},\"default\":[]}],\"default\":null},{\"name\":\"tip\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"notes\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"finalizedAtDateTime\",\"type\":[\"null\",\"long\"],\"default\":null}]}],\"default\":null},{\"name\":\"meta\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"MetaType\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"source\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"platform\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"runBy\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public Long id;
  @Deprecated public Long veeaMerchantId;
  @Deprecated public Long timestamp;
  @Deprecated public CharSequence transactionType;
  @Deprecated public RequestType request;
  @Deprecated public ResponseType response;
  @Deprecated public java.util.List<StatusDetailsType> statusDetails;
  @Deprecated public AdditionalReceiptDataType additionalReceiptData;
  @Deprecated public VeeaTicketType veeaTicket;
  @Deprecated public MetaType meta;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TransactionLog() {}

  /**
   * All-args constructor.
   */
  public TransactionLog(Long id, Long veeaMerchantId, Long timestamp, CharSequence transactionType, RequestType request, ResponseType response, java.util.List<StatusDetailsType> statusDetails, AdditionalReceiptDataType additionalReceiptData, VeeaTicketType veeaTicket, MetaType meta) {
    this.id = id;
    this.veeaMerchantId = veeaMerchantId;
    this.timestamp = timestamp;
    this.transactionType = transactionType;
    this.request = request;
    this.response = response;
    this.statusDetails = statusDetails;
    this.additionalReceiptData = additionalReceiptData;
    this.veeaTicket = veeaTicket;
    this.meta = meta;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return veeaMerchantId;
    case 2: return timestamp;
    case 3: return transactionType;
    case 4: return request;
    case 5: return response;
    case 6: return statusDetails;
    case 7: return additionalReceiptData;
    case 8: return veeaTicket;
    case 9: return meta;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: id = (Long)value$; break;
    case 1: veeaMerchantId = (Long)value$; break;
    case 2: timestamp = (Long)value$; break;
    case 3: transactionType = (CharSequence)value$; break;
    case 4: request = (RequestType)value$; break;
    case 5: response = (ResponseType)value$; break;
    case 6: statusDetails = (java.util.List<StatusDetailsType>)value$; break;
    case 7: additionalReceiptData = (AdditionalReceiptDataType)value$; break;
    case 8: veeaTicket = (VeeaTicketType)value$; break;
    case 9: meta = (MetaType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'veeaMerchantId' field.
   */
  public Long getVeeaMerchantId() {
    return veeaMerchantId;
  }

  /**
   * Sets the value of the 'veeaMerchantId' field.
   * @param value the value to set.
   */
  public void setVeeaMerchantId(Long value) {
    this.veeaMerchantId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'transactionType' field.
   */
  public CharSequence getTransactionType() {
    return transactionType;
  }

  /**
   * Sets the value of the 'transactionType' field.
   * @param value the value to set.
   */
  public void setTransactionType(CharSequence value) {
    this.transactionType = value;
  }

  /**
   * Gets the value of the 'request' field.
   */
  public RequestType getRequest() {
    return request;
  }

  /**
   * Sets the value of the 'request' field.
   * @param value the value to set.
   */
  public void setRequest(RequestType value) {
    this.request = value;
  }

  /**
   * Gets the value of the 'response' field.
   */
  public ResponseType getResponse() {
    return response;
  }

  /**
   * Sets the value of the 'response' field.
   * @param value the value to set.
   */
  public void setResponse(ResponseType value) {
    this.response = value;
  }

  /**
   * Gets the value of the 'statusDetails' field.
   */
  public java.util.List<StatusDetailsType> getStatusDetails() {
    return statusDetails;
  }

  /**
   * Sets the value of the 'statusDetails' field.
   * @param value the value to set.
   */
  public void setStatusDetails(java.util.List<StatusDetailsType> value) {
    this.statusDetails = value;
  }

  /**
   * Gets the value of the 'additionalReceiptData' field.
   */
  public AdditionalReceiptDataType getAdditionalReceiptData() {
    return additionalReceiptData;
  }

  /**
   * Sets the value of the 'additionalReceiptData' field.
   * @param value the value to set.
   */
  public void setAdditionalReceiptData(AdditionalReceiptDataType value) {
    this.additionalReceiptData = value;
  }

  /**
   * Gets the value of the 'veeaTicket' field.
   */
  public VeeaTicketType getVeeaTicket() {
    return veeaTicket;
  }

  /**
   * Sets the value of the 'veeaTicket' field.
   * @param value the value to set.
   */
  public void setVeeaTicket(VeeaTicketType value) {
    this.veeaTicket = value;
  }

  /**
   * Gets the value of the 'meta' field.
   */
  public MetaType getMeta() {
    return meta;
  }

  /**
   * Sets the value of the 'meta' field.
   * @param value the value to set.
   */
  public void setMeta(MetaType value) {
    this.meta = value;
  }

  /** Creates a new TransactionLog RecordBuilder */
  public static TransactionLog.Builder newBuilder() {
    return new TransactionLog.Builder();
  }
  
  /** Creates a new TransactionLog RecordBuilder by copying an existing Builder */
  public static TransactionLog.Builder newBuilder(TransactionLog.Builder other) {
    return new TransactionLog.Builder(other);
  }
  
  /** Creates a new TransactionLog RecordBuilder by copying an existing TransactionLog instance */
  public static TransactionLog.Builder newBuilder(TransactionLog other) {
    return new TransactionLog.Builder(other);
  }
  
  /**
   * RecordBuilder for TransactionLog instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TransactionLog>
    implements org.apache.avro.data.RecordBuilder<TransactionLog> {

    private Long id;
    private Long veeaMerchantId;
    private Long timestamp;
    private CharSequence transactionType;
    private RequestType request;
    private ResponseType response;
    private java.util.List<StatusDetailsType> statusDetails;
    private AdditionalReceiptDataType additionalReceiptData;
    private VeeaTicketType veeaTicket;
    private MetaType meta;

    /** Creates a new Builder */
    private Builder() {
      super(TransactionLog.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(TransactionLog.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.veeaMerchantId)) {
        this.veeaMerchantId = data().deepCopy(fields()[1].schema(), other.veeaMerchantId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.transactionType)) {
        this.transactionType = data().deepCopy(fields()[3].schema(), other.transactionType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.request)) {
        this.request = data().deepCopy(fields()[4].schema(), other.request);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.response)) {
        this.response = data().deepCopy(fields()[5].schema(), other.response);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.statusDetails)) {
        this.statusDetails = data().deepCopy(fields()[6].schema(), other.statusDetails);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.additionalReceiptData)) {
        this.additionalReceiptData = data().deepCopy(fields()[7].schema(), other.additionalReceiptData);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.veeaTicket)) {
        this.veeaTicket = data().deepCopy(fields()[8].schema(), other.veeaTicket);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.meta)) {
        this.meta = data().deepCopy(fields()[9].schema(), other.meta);
        fieldSetFlags()[9] = true;
      }
    }
    
    /** Creates a Builder by copying an existing TransactionLog instance */
    private Builder(TransactionLog other) {
            super(TransactionLog.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.veeaMerchantId)) {
        this.veeaMerchantId = data().deepCopy(fields()[1].schema(), other.veeaMerchantId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.transactionType)) {
        this.transactionType = data().deepCopy(fields()[3].schema(), other.transactionType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.request)) {
        this.request = data().deepCopy(fields()[4].schema(), other.request);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.response)) {
        this.response = data().deepCopy(fields()[5].schema(), other.response);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.statusDetails)) {
        this.statusDetails = data().deepCopy(fields()[6].schema(), other.statusDetails);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.additionalReceiptData)) {
        this.additionalReceiptData = data().deepCopy(fields()[7].schema(), other.additionalReceiptData);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.veeaTicket)) {
        this.veeaTicket = data().deepCopy(fields()[8].schema(), other.veeaTicket);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.meta)) {
        this.meta = data().deepCopy(fields()[9].schema(), other.meta);
        fieldSetFlags()[9] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public Long getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public TransactionLog.Builder setId(Long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public TransactionLog.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'veeaMerchantId' field */
    public Long getVeeaMerchantId() {
      return veeaMerchantId;
    }
    
    /** Sets the value of the 'veeaMerchantId' field */
    public TransactionLog.Builder setVeeaMerchantId(Long value) {
      validate(fields()[1], value);
      this.veeaMerchantId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'veeaMerchantId' field has been set */
    public boolean hasVeeaMerchantId() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'veeaMerchantId' field */
    public TransactionLog.Builder clearVeeaMerchantId() {
      veeaMerchantId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'timestamp' field */
    public Long getTimestamp() {
      return timestamp;
    }
    
    /** Sets the value of the 'timestamp' field */
    public TransactionLog.Builder setTimestamp(Long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'timestamp' field has been set */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'timestamp' field */
    public TransactionLog.Builder clearTimestamp() {
      timestamp = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'transactionType' field */
    public CharSequence getTransactionType() {
      return transactionType;
    }
    
    /** Sets the value of the 'transactionType' field */
    public TransactionLog.Builder setTransactionType(CharSequence value) {
      validate(fields()[3], value);
      this.transactionType = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'transactionType' field has been set */
    public boolean hasTransactionType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'transactionType' field */
    public TransactionLog.Builder clearTransactionType() {
      transactionType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'request' field */
    public RequestType getRequest() {
      return request;
    }
    
    /** Sets the value of the 'request' field */
    public TransactionLog.Builder setRequest(RequestType value) {
      validate(fields()[4], value);
      this.request = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'request' field has been set */
    public boolean hasRequest() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'request' field */
    public TransactionLog.Builder clearRequest() {
      request = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'response' field */
    public ResponseType getResponse() {
      return response;
    }
    
    /** Sets the value of the 'response' field */
    public TransactionLog.Builder setResponse(ResponseType value) {
      validate(fields()[5], value);
      this.response = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'response' field has been set */
    public boolean hasResponse() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'response' field */
    public TransactionLog.Builder clearResponse() {
      response = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'statusDetails' field */
    public java.util.List<StatusDetailsType> getStatusDetails() {
      return statusDetails;
    }
    
    /** Sets the value of the 'statusDetails' field */
    public TransactionLog.Builder setStatusDetails(java.util.List<StatusDetailsType> value) {
      validate(fields()[6], value);
      this.statusDetails = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'statusDetails' field has been set */
    public boolean hasStatusDetails() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'statusDetails' field */
    public TransactionLog.Builder clearStatusDetails() {
      statusDetails = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'additionalReceiptData' field */
    public AdditionalReceiptDataType getAdditionalReceiptData() {
      return additionalReceiptData;
    }
    
    /** Sets the value of the 'additionalReceiptData' field */
    public TransactionLog.Builder setAdditionalReceiptData(AdditionalReceiptDataType value) {
      validate(fields()[7], value);
      this.additionalReceiptData = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'additionalReceiptData' field has been set */
    public boolean hasAdditionalReceiptData() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'additionalReceiptData' field */
    public TransactionLog.Builder clearAdditionalReceiptData() {
      additionalReceiptData = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'veeaTicket' field */
    public VeeaTicketType getVeeaTicket() {
      return veeaTicket;
    }
    
    /** Sets the value of the 'veeaTicket' field */
    public TransactionLog.Builder setVeeaTicket(VeeaTicketType value) {
      validate(fields()[8], value);
      this.veeaTicket = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'veeaTicket' field has been set */
    public boolean hasVeeaTicket() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'veeaTicket' field */
    public TransactionLog.Builder clearVeeaTicket() {
      veeaTicket = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'meta' field */
    public MetaType getMeta() {
      return meta;
    }
    
    /** Sets the value of the 'meta' field */
    public TransactionLog.Builder setMeta(MetaType value) {
      validate(fields()[9], value);
      this.meta = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'meta' field has been set */
    public boolean hasMeta() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'meta' field */
    public TransactionLog.Builder clearMeta() {
      meta = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public TransactionLog build() {
      try {
        TransactionLog record = new TransactionLog();
        record.id = fieldSetFlags()[0] ? this.id : (Long) defaultValue(fields()[0]);
        record.veeaMerchantId = fieldSetFlags()[1] ? this.veeaMerchantId : (Long) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (Long) defaultValue(fields()[2]);
        record.transactionType = fieldSetFlags()[3] ? this.transactionType : (CharSequence) defaultValue(fields()[3]);
        record.request = fieldSetFlags()[4] ? this.request : (RequestType) defaultValue(fields()[4]);
        record.response = fieldSetFlags()[5] ? this.response : (ResponseType) defaultValue(fields()[5]);
        record.statusDetails = fieldSetFlags()[6] ? this.statusDetails : (java.util.List<StatusDetailsType>) defaultValue(fields()[6]);
        record.additionalReceiptData = fieldSetFlags()[7] ? this.additionalReceiptData : (AdditionalReceiptDataType) defaultValue(fields()[7]);
        record.veeaTicket = fieldSetFlags()[8] ? this.veeaTicket : (VeeaTicketType) defaultValue(fields()[8]);
        record.meta = fieldSetFlags()[9] ? this.meta : (MetaType) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
