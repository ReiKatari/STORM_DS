package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t28  reason: default package */
/* loaded from: classes.dex */
public final class t28 extends s28 {
    public static final t28 X = new t28(new Object[0], 0);
    public final transient Object[] L;
    public final transient int R;

    public t28(Object[] objArr, int i) {
        this.L = objArr;
        this.R = i;
    }

    @Override // defpackage.s28, defpackage.p28
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.L;
        int i = this.R;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.p28
    public final int b() {
        return this.R;
    }

    @Override // defpackage.p28
    public final int c() {
        return 0;
    }

    @Override // defpackage.p28
    public final boolean d() {
        return false;
    }

    @Override // defpackage.p28
    public final Object[] f() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        su7.b(i, this.R);
        Object obj = this.L[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R;
    }
}
