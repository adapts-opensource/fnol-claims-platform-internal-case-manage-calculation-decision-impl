// Feature: Insured Engagement & Tracking:decision:transformation
final class TransformationConstants {
    private TransformationConstants() {}

    static final String STATUS_PENDING = "Pending";
    static final String STATUS_APPROVED = "Approved";
    static final String STATUS_REJECTED = "Rejected";
    static final String ACTION_RESERVE_STATUS_TRANSFORMED = "RESERVE_STATUS_TRANSFORMED";
    
    static final String ATTR_RESERVE_ID = "reserve_id";
    static final String ATTR_EXPOSURE_ID = "exposure_id";
    static final String ATTR_AMOUNT = "amount";
    static final String ATTR_CURRENCY = "currency";
    static final String ATTR_APPROVAL_STATUS = "approval_status";
    
    static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
}
