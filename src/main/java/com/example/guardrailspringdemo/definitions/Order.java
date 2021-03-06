/*
 * This file was generated by Guardrail (https://github.com/twilio/guardrail).
 * Modifications will be overwritten; instead edit the OpenAPI/Swagger spec file.
*/
package com.example.guardrailspringdemo.definitions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import static java.util.Objects.requireNonNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    @JsonProperty("id")
    private final Optional<Long> id;

    @JsonProperty("petId")
    private final Optional<Long> petId;

    @JsonProperty("quantity")
    private final Optional<Integer> quantity;

    @JsonProperty("shipDate")
    private final Optional<java.time.OffsetDateTime> shipDate;

    @JsonProperty("status")
    private final Optional<String> status;

    @JsonProperty("complete")
    private final Optional<Boolean> complete;

    @JsonCreator
    protected Order(@JsonProperty("id") final Optional<Long> id, @JsonProperty("petId") final Optional<Long> petId,
            @JsonProperty("quantity") final Optional<Integer> quantity,
            @JsonProperty("shipDate") final Optional<java.time.OffsetDateTime> shipDate,
            @JsonProperty("status") final Optional<String> status,
            @JsonProperty("complete") final Optional<Boolean> complete) {
        super();
        this.id = id == null ? Optional.empty() : id;
        this.petId = petId == null ? Optional.empty() : petId;
        this.quantity = quantity == null ? Optional.empty() : quantity;
        this.shipDate = shipDate == null ? Optional.empty() : shipDate;
        this.status = status == null ? Optional.empty() : status;
        this.complete = complete == null ? Optional.empty() : complete;
    }

    public Optional<Long> getId() {
        return this.id;
    }

    public Optional<Long> getPetId() {
        return this.petId;
    }

    public Optional<Integer> getQuantity() {
        return this.quantity;
    }

    public Optional<java.time.OffsetDateTime> getShipDate() {
        return this.shipDate;
    }

    public Optional<String> getStatus() {
        return this.status;
    }

    public Optional<Boolean> getComplete() {
        return this.complete;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + getId() + ", petId=" + getPetId() + ", quantity=" + getQuantity() + ", shipDate="
                + getShipDate() + ", status=" + getStatus() + ", complete=" + getComplete() + "}";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Order other = (Order) o;
        return getId().equals(other.getId()) && getPetId().equals(other.getPetId())
                && getQuantity().equals(other.getQuantity()) && getShipDate().equals(other.getShipDate())
                && getStatus().equals(other.getStatus()) && getComplete().equals(other.getComplete());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getId(), getPetId(), getQuantity(), getShipDate(), getStatus(), getComplete());
    }

    public static class Builder {

        private Optional<Long> id = Optional.empty();

        private Optional<Long> petId = Optional.empty();

        private Optional<Integer> quantity = Optional.empty();

        private Optional<java.time.OffsetDateTime> shipDate = Optional.empty();

        private Optional<String> status = Optional.empty();

        private Optional<Boolean> complete = Optional.ofNullable(false);

        public Builder() {
        }

        public Builder(final Order template) {
            this.id = template.getId();
            this.petId = template.getPetId();
            this.quantity = template.getQuantity();
            this.shipDate = template.getShipDate();
            this.status = template.getStatus();
            this.complete = template.getComplete();
        }

        public Builder withId(final long id) {
            this.id = Optional.of(id);
            return this;
        }

        public Builder withId(final Optional<Long> optionalId) {
            this.id = requireNonNull(optionalId, "optionalId is required");
            return this;
        }

        public Builder withPetId(final long petId) {
            this.petId = Optional.of(petId);
            return this;
        }

        public Builder withPetId(final Optional<Long> optionalPetId) {
            this.petId = requireNonNull(optionalPetId, "optionalPetId is required");
            return this;
        }

        public Builder withQuantity(final int quantity) {
            this.quantity = Optional.of(quantity);
            return this;
        }

        public Builder withQuantity(final Optional<Integer> optionalQuantity) {
            this.quantity = requireNonNull(optionalQuantity, "optionalQuantity is required");
            return this;
        }

        public Builder withShipDate(final java.time.OffsetDateTime shipDate) {
            this.shipDate = Optional.ofNullable(shipDate);
            return this;
        }

        public Builder withShipDate(final Optional<java.time.OffsetDateTime> optionalShipDate) {
            this.shipDate = requireNonNull(optionalShipDate, "optionalShipDate is required");
            return this;
        }

        public Builder withStatus(final String status) {
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder withStatus(final Optional<String> optionalStatus) {
            this.status = requireNonNull(optionalStatus, "optionalStatus is required");
            return this;
        }

        public Builder withComplete(final boolean complete) {
            this.complete = Optional.of(complete);
            return this;
        }

        public Builder withComplete(final Optional<Boolean> optionalComplete) {
            this.complete = requireNonNull(optionalComplete, "optionalComplete is required");
            return this;
        }

        public Order build() {
            requireNonNull(this.id, "this.id is required");
            requireNonNull(this.petId, "this.petId is required");
            requireNonNull(this.quantity, "this.quantity is required");
            requireNonNull(this.shipDate, "this.shipDate is required");
            requireNonNull(this.status, "this.status is required");
            requireNonNull(this.complete, "this.complete is required");
            return new Order(this.id, this.petId, this.quantity, this.shipDate, this.status, this.complete);
        }
    }
}
