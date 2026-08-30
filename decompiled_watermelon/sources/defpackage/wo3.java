package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wo3  reason: default package */
/* loaded from: classes.dex */
public final class wo3 extends AbstractSet {
    public final /* synthetic */ int A;
    public final /* synthetic */ Map B;

    public /* synthetic */ wo3(int i, Map map) {
        this.A = i;
        this.B = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                ((yo3) map).clear();
                return;
            case 1:
                ((yo3) map).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A
            java.util.Map r1 = r3.B
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.contains(r4)
            return r3
        Lc:
            yo3 r1 = (defpackage.yo3) r1
            boolean r3 = r1.containsKey(r4)
            return r3
        L13:
            boolean r3 = r4 instanceof java.util.Map.Entry
            r0 = 0
            if (r3 == 0) goto L3b
            yo3 r1 = (defpackage.yo3) r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            r2 = 0
            if (r3 == 0) goto L28
            xo3 r3 = r1.a(r0, r3)     // Catch: java.lang.ClassCastException -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L38
            java.lang.Object r1 = r3.c0
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L38
            r2 = r3
        L38:
            if (r2 == 0) goto L3b
            r0 = 1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo3.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                return new vo3((yo3) map, 0);
            case 1:
                return new vo3((yo3) map, 1);
            default:
                return new cu((eu) map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A
            r1 = 0
            java.util.Map r2 = r5.B
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lf;
                default: goto La;
            }
        La:
            boolean r5 = super.remove(r6)
            return r5
        Lf:
            yo3 r2 = (defpackage.yo3) r2
            if (r6 == 0) goto L17
            xo3 r1 = r2.a(r3, r6)     // Catch: java.lang.ClassCastException -> L17
        L17:
            if (r1 == 0) goto L1c
            r2.c(r1, r4)
        L1c:
            if (r1 == 0) goto L1f
            r3 = r4
        L1f:
            return r3
        L20:
            yo3 r2 = (defpackage.yo3) r2
            boolean r5 = r6 instanceof java.util.Map.Entry
            if (r5 != 0) goto L27
            goto L4b
        L27:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            if (r5 == 0) goto L34
            xo3 r5 = r2.a(r3, r5)     // Catch: java.lang.ClassCastException -> L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L44
            java.lang.Object r0 = r5.c0
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r0, r6)
            if (r6 == 0) goto L44
            r1 = r5
        L44:
            if (r1 != 0) goto L47
            goto L4b
        L47:
            r2.c(r1, r4)
            r3 = r4
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo3.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.A;
        Map map = this.B;
        switch (i) {
            case 0:
                return ((yo3) map).R;
            case 1:
                return ((yo3) map).R;
            default:
                return ((eu) map).L;
        }
    }
}
