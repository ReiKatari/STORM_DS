package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r28  reason: default package */
/* loaded from: classes.dex */
public final class r28 extends s28 {
    public final transient int L;
    public final transient int R;
    public final /* synthetic */ s28 X;

    public r28(s28 s28Var, int i, int i2) {
        this.X = s28Var;
        this.L = i;
        this.R = i2;
    }

    @Override // defpackage.p28
    public final int b() {
        return this.X.c() + this.L + this.R;
    }

    @Override // defpackage.p28
    public final int c() {
        return this.X.c() + this.L;
    }

    @Override // defpackage.p28
    public final boolean d() {
        return true;
    }

    @Override // defpackage.p28
    public final Object[] f() {
        return this.X.f();
    }

    @Override // defpackage.s28, java.util.List
    /* renamed from: g */
    public final s28 subList(int i, int i2) {
        su7.d(i, i2, this.R);
        int i3 = this.L;
        return this.X.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        su7.b(i, this.R);
        return this.X.get(i + this.L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}
