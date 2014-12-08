package at.irian.cdiatwork.ideafork.backend.api.domain.change;

import at.irian.cdiatwork.ideafork.backend.api.domain.BaseEntity;

public class EntityChange extends BaseEntity {
    private static final long serialVersionUID = -6314134718971162163L;

    private final String entityId; //just for an easier selection
    private final long entityVersion;
    private final String entityState;
    private final long changeTimestamp;

    public EntityChange(String id, long version, String entityState, long changeTimestamp) {
        this.entityId = id;
        this.entityVersion = version;
        this.entityState = entityState;
        this.changeTimestamp = changeTimestamp;
    }

    public String getEntityId() {
        return entityId;
    }

    public long getEntityVersion() {
        return entityVersion;
    }

    public String getEntityState() {
        return entityState;
    }

    public long getChangeTimestamp() {
        return changeTimestamp;
    }
}
