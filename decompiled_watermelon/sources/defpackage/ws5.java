package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws5  reason: default package */
/* loaded from: classes.dex */
public class ws5 implements Iterable {
    public ts5 A;
    public ts5 B;
    public final WeakHashMap L = new WeakHashMap();
    public int R = 0;

    public ts5 b(Object obj) {
        ts5 ts5Var = this.A;
        while (ts5Var != null && !ts5Var.A.equals(obj)) {
            ts5Var = ts5Var.L;
        }
        return ts5Var;
    }

    public Object c(Object obj) {
        ts5 b = b(obj);
        if (b == null) {
            return null;
        }
        this.R--;
        WeakHashMap weakHashMap = this.L;
        if (!weakHashMap.isEmpty()) {
            for (vs5 vs5Var : weakHashMap.keySet()) {
                vs5Var.a(b);
            }
        }
        ts5 ts5Var = b.R;
        ts5 ts5Var2 = b.L;
        if (ts5Var != null) {
            ts5Var.L = ts5Var2;
        } else {
            this.A = ts5Var2;
        }
        ts5 ts5Var3 = b.L;
        if (ts5Var3 != null) {
            ts5Var3.R = ts5Var;
        } else {
            this.B = ts5Var;
        }
        b.L = null;
        b.R = null;
        return b.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r1.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.ss5) r6).hasNext() != false) goto L35;
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
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.ws5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ws5 r6 = (defpackage.ws5) r6
            int r1 = r5.R
            int r3 = r6.R
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            ss5 r1 = (defpackage.ss5) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            ss5 r3 = (defpackage.ss5) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            ss5 r6 = (defpackage.ss5) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ss5 ss5Var = (ss5) it;
            if (ss5Var.hasNext()) {
                i += ((Map.Entry) ss5Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ss5 ss5Var = new ss5(this.A, this.B, 0);
        this.L.put(ss5Var, Boolean.FALSE);
        return ss5Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ss5 ss5Var = (ss5) it;
            if (ss5Var.hasNext()) {
                sb.append(((Map.Entry) ss5Var.next()).toString());
                if (ss5Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
