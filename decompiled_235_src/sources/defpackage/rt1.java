package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt1  reason: default package */
/* loaded from: classes.dex */
public final class rt1 implements e43 {
    public final boolean A;

    public rt1(boolean z) {
        this.A = z;
    }

    @Override // defpackage.e43
    public final boolean e() {
        return this.A;
    }

    @Override // defpackage.e43
    public final gg4 f() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.A) {
            str = "Active";
        } else {
            str = "New";
        }
        return lb1.q(sb, str, '}');
    }
}
