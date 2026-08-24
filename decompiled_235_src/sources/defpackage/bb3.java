package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb3  reason: default package */
/* loaded from: classes.dex */
public final class bb3 {
    public final int a;
    public final int b;
    public final vp3 c;

    public bb3(int i, int i2, vp3 vp3Var) {
        this.a = i;
        this.b = i2;
        this.c = vp3Var;
        if (i < 0) {
            s53.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        s53.a("size should be > 0");
    }
}
