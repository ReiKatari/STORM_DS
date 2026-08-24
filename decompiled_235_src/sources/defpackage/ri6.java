package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri6  reason: default package */
/* loaded from: classes.dex */
public final class ri6 extends gi2 {
    public final j41 e;
    public final vs4 f = np2.Y(null);

    public ri6(j41 j41Var) {
        this.e = j41Var;
    }

    @Override // defpackage.gi2
    public final Object D(j41 j41Var) {
        if (j41Var != this.e) {
            p53.c("Check failed.");
        }
        Object value = this.f.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // defpackage.gi2
    public final boolean z(j41 j41Var) {
        if (j41Var == this.e) {
            return true;
        }
        return false;
    }
}
