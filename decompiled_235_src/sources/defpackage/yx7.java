package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yx7 implements lu3, no2 {
    public final /* synthetic */ zx0 A;

    public yx7(zx0 zx0Var) {
        this.A = zx0Var;
    }

    @Override // defpackage.no2
    public final ao2 b() {
        return new po2(1, this.A, zx0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lu3) && (obj instanceof no2)) {
            return b().equals(((no2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
