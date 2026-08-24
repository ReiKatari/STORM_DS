package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k18  reason: default package */
/* loaded from: classes.dex */
public enum k18 {
    OK("ok"),
    CANCELLED("canceled"),
    UNKNOWN("unknown"),
    INVALID_ARGUMENT("invalid argument"),
    DEADLINE_EXCEEDED("deadline exceeded"),
    NOT_FOUND("not found"),
    ALREADY_EXISTS("already exists"),
    PERMISSION_DENIED("permission denied"),
    RESOURCE_EXHAUSTED("resource exhausted"),
    FAILED_PRECONDITION("failed precondition"),
    ABORTED("aborted"),
    OUT_OF_RANGE("out of range"),
    UNIMPLEMENTED("unimplemented"),
    INTERNAL("internal"),
    UNAVAILABLE("unavailable"),
    DATA_LOSS("data loss"),
    UNAUTHENTICATED("unauthenticated");
    
    private final String zbs;

    k18(String str) {
        this.zbs = str;
    }

    public final String zba() {
        return this.zbs;
    }
}
