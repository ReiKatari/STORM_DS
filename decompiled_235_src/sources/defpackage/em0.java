package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em0  reason: default package */
/* loaded from: classes.dex */
public final class em0 extends fm0 {
    public final Throwable a;

    public em0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof em0) {
            if (nb3.k(this.a, ((em0) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fm0
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
