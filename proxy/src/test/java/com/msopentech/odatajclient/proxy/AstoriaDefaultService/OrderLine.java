package com.msopentech.odatajclient.proxy.AstoriaDefaultService;

import com.msopentech.odatajclient.proxy.api.AbstractEntitySet;
import com.msopentech.odatajclient.proxy.api.annotations.EntitySet;
import com.msopentech.odatajclient.proxy.api.annotations.CompoundKey;
import com.msopentech.odatajclient.proxy.api.annotations.CompoundKeyElement;
import com.msopentech.odatajclient.proxy.AstoriaDefaultService.types.*;

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

import java.io.Serializable;
import com.msopentech.odatajclient.proxy.AstoriaDefaultService.OrderLine.OrderLineKey;

@EntitySet("OrderLine")
public interface OrderLine extends AbstractEntitySet<com.msopentech.odatajclient.proxy.AstoriaDefaultService.types.OrderLine, OrderLineKey> {
    
    @CompoundKey
    public static class OrderLineKey implements Serializable {
    
        private Integer _orderId;

        @CompoundKeyElement(name = "OrderId", position = 0)
        public Integer getOrderId() {
            return _orderId;
        }

        public void setOrderId(final Integer _orderId) {
            this._orderId = _orderId;
        }
    
        private Integer _productId;

        @CompoundKeyElement(name = "ProductId", position = 1)
        public Integer getProductId() {
            return _productId;
        }

        public void setProductId(final Integer _productId) {
            this._productId = _productId;
        }
    }
}
