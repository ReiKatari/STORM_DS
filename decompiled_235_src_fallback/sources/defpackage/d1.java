package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d1  reason: default package */
/* loaded from: classes.dex */
public abstract class d1 extends java.util.AbstractList implements java.util.List, defpackage.ag3 {
    public d1() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int a();

    public abstract java.lang.Object b(int r1);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.b(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
            r0 = this;
            int r0 = r0.a()
            return r0
    }
}
