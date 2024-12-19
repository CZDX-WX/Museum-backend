package com.czdxwx.museumbackend.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName creative_products
 */
@TableName(value ="creative_products")
@Data
public class CreativeProducts implements Serializable {
    /**
     * 
     */
    @TableId
    private String creativeId;

    /**
     * 
     */
    private String creativeName;

    /**
     * 
     */
    private BigDecimal price;

    /**
     * 
     */
    private Integer stock;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String imageUrl;

    /**
     * 
     */
    private Date createdAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CreativeProducts other = (CreativeProducts) that;
        return (this.getCreativeId() == null ? other.getCreativeId() == null : this.getCreativeId().equals(other.getCreativeId()))
            && (this.getCreativeName() == null ? other.getCreativeName() == null : this.getCreativeName().equals(other.getCreativeName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCreativeId() == null) ? 0 : getCreativeId().hashCode());
        result = prime * result + ((getCreativeName() == null) ? 0 : getCreativeName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", creativeId=").append(creativeId);
        sb.append(", creativeName=").append(creativeName);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", description=").append(description);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}