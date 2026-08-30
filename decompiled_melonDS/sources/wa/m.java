package wa;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends AbstractSet {
    public final /* synthetic */ int A;
    public final /* synthetic */ Map B;

    public /* synthetic */ m(int i2, Map map) {
        this.A = i2;
        this.B = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.A) {
            case 0:
                ((o) this.B).clear();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((o) this.B).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.A
            switch(r0) {
                case 0: goto L13;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.contains(r5)
            return r5
        La:
            java.util.Map r0 = r4.B
            wa.o r0 = (wa.o) r0
            boolean r5 = r0.containsKey(r5)
            return r5
        L13:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L3d
            java.util.Map r0 = r4.B
            wa.o r0 = (wa.o) r0
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L2a
            wa.n r0 = r0.a(r1, r2)     // Catch: java.lang.ClassCastException -> L2a
            goto L2b
        L2a:
            r0 = r3
        L2b:
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r0.f14183b0
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L3a
            r3 = r0
        L3a:
            if (r3 == 0) goto L3d
            r1 = 1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.m.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new l((o) this.B, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new l((o) this.B, 1);
            default:
                return new a1.c((a1.e) this.B);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A
            switch(r0) {
                case 0: goto L20;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r6 = super.remove(r6)
            return r6
        La:
            java.util.Map r0 = r5.B
            wa.o r0 = (wa.o) r0
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L16
            wa.n r2 = r0.a(r1, r6)     // Catch: java.lang.ClassCastException -> L16
        L16:
            r6 = 1
            if (r2 == 0) goto L1c
            r0.c(r2, r6)
        L1c:
            if (r2 == 0) goto L1f
            r1 = r6
        L1f:
            return r1
        L20:
            java.util.Map r0 = r5.B
            wa.o r0 = (wa.o) r0
            boolean r1 = r6 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto L2a
            goto L4f
        L2a:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getKey()
            r3 = 0
            if (r1 == 0) goto L38
            wa.n r1 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L38
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 == 0) goto L48
            java.lang.Object r4 = r1.f14183b0
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r4, r6)
            if (r6 == 0) goto L48
            r3 = r1
        L48:
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            r2 = 1
            r0.c(r3, r2)
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.m.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.A) {
            case 0:
                return ((o) this.B).R;
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((o) this.B).R;
            default:
                return ((a1.e) this.B).L;
        }
    }
}
