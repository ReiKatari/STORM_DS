package defpackage;

import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo4  reason: default package */
/* loaded from: classes.dex */
public final class eo4 extends z0 implements RandomAccess {
    public final da0[] A;
    public final int[] B;

    public eo4(da0[] da0VarArr, int[] iArr) {
        this.A = da0VarArr;
        this.B = iArr;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.A.length;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof da0)) {
            return false;
        }
        return super.contains((da0) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.A[i];
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof da0)) {
            return -1;
        }
        return super.indexOf((da0) obj);
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof da0)) {
            return -1;
        }
        return super.lastIndexOf((da0) obj);
    }
}
