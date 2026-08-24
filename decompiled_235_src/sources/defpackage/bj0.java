package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj0  reason: default package */
/* loaded from: classes.dex */
public final class bj0 extends Exception {
    public final int A;

    public bj0(int i, RuntimeException runtimeException) {
        super("Expected camera missing from device.", runtimeException);
        this.A = i;
    }
}
