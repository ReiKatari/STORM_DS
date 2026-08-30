package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class f implements Iterable {
    public c A;
    public c B;
    public final WeakHashMap L = new WeakHashMap();
    public int R = 0;

    public c a(Object obj) {
        c cVar = this.A;
        while (cVar != null && !cVar.A.equals(obj)) {
            cVar = cVar.L;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a10 = a(obj);
        if (a10 == null) {
            return null;
        }
        this.R--;
        WeakHashMap weakHashMap = this.L;
        if (!weakHashMap.isEmpty()) {
            for (e eVar : weakHashMap.keySet()) {
                eVar.a(a10);
            }
        }
        c cVar = a10.R;
        c cVar2 = a10.L;
        if (cVar != null) {
            cVar.L = cVar2;
        } else {
            this.A = cVar2;
        }
        c cVar3 = a10.L;
        if (cVar3 != null) {
            cVar3.R = cVar;
        } else {
            this.B = cVar;
        }
        a10.L = null;
        a10.R = null;
        return a10.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((s.b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof s.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.f r7 = (s.f) r7
            int r1 = r6.R
            int r3 = r7.R
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            s.b r3 = (s.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            s.b r4 = (s.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            s.b r7 = (s.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                i2 += ((Map.Entry) bVar.next()).hashCode();
            } else {
                return i2;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.A, this.B, 0);
        this.L.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (bVar.hasNext()) {
                sb2.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
