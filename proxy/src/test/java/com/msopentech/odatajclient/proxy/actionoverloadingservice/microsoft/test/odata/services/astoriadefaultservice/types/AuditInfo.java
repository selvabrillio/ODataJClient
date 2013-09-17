package com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.types;

import com.msopentech.odatajclient.proxy.api.annotations.ComplexType;
import com.msopentech.odatajclient.proxy.api.annotations.Property;
import com.msopentech.odatajclient.proxy.api.AbstractComplexType;
import com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.*;
import com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.types.*;

// EdmSimpleType property imports
import com.msopentech.odatajclient.engine.data.ODataDuration;
import com.msopentech.odatajclient.engine.data.ODataTimestamp;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Geospatial;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.GeospatialCollection;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.LineString;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiLineString;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiPoint;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.MultiPolygon;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Point;
import com.msopentech.odatajclient.engine.data.metadata.edm.geospatial.Polygon;
import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.Collection;

@ComplexType("AuditInfo")
public class AuditInfo extends AbstractComplexType {

    private ODataTimestamp _modifiedDate;

    @Property(name = "ModifiedDate", type = "Edm.DateTime", nullable = false)
    public ODataTimestamp getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(final ODataTimestamp _modifiedDate) {
        this._modifiedDate = _modifiedDate;
    }
    private String _modifiedBy;

    @Property(name = "ModifiedBy", type = "Edm.String", nullable = true)
    public String getModifiedBy() {
        return _modifiedBy;
    }

    public void setModifiedBy(final String _modifiedBy) {
        this._modifiedBy = _modifiedBy;
    }
    private com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.types.ConcurrencyInfo _concurrency;

    @Property(name = "Concurrency", type = "Microsoft.Test.OData.Services.AstoriaDefaultService.ConcurrencyInfo", nullable = true)
    public com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.types.ConcurrencyInfo getConcurrency() {
        return _concurrency;
    }

    public void setConcurrency(final com.msopentech.odatajclient.proxy.actionoverloadingservice.microsoft.test.odata.services.astoriadefaultservice.types.ConcurrencyInfo _concurrency) {
        this._concurrency = _concurrency;
    }
}