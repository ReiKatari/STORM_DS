package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s36  reason: default package */
/* loaded from: classes.dex */
public class s36 implements Iterable {
    public p36 A;
    public p36 B;
    public final WeakHashMap L = new WeakHashMap();
    public int R = 0;

    public p36 a(Object obj) {
        p36 p36Var = this.A;
        while (p36Var != null && !p36Var.A.equals(obj)) {
            p36Var = p36Var.L;
        }
        return p36Var;
    }

    public Object b(Object obj) {
        p36 a = a(obj);
        if (a == null) {
            return null;
        }
        this.R--;
        WeakHashMap weakHashMap = this.L;
        if (!weakHashMap.isEmpty()) {
            for (r36 r36Var : weakHashMap.keySet()) {
                r36Var.a(a);
            }
        }
        p36 p36Var = a.R;
        p36 p36Var2 = a.L;
        if (p36Var != null) {
            p36Var.L = p36Var2;
        } else {
            this.A = p36Var2;
        }
        p36 p36Var3 = a.L;
        if (p36Var3 != null) {
            p36Var3.R = p36Var;
        } else {
            this.B = p36Var;
        }
        a.L = null;
        a.R = null;
        return a.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r1.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.o36) r6).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s36)) {
            return false;
        }
        s36 s36Var = (s36) obj;
        if (this.R != s36Var.R) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = s36Var.iterator();
        while (true) {
            o36 o36Var = (o36) it;
            if (!o36Var.hasNext()) {
                break;
            }
            o36 o36Var2 = (o36) it2;
            if (!o36Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) o36Var.next();
            Object next = o36Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            o36 o36Var = (o36) it;
            if (o36Var.hasNext()) {
                i += ((Map.Entry) o36Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        o36 o36Var = new o36(this.A, this.B, 0);
        this.L.put(o36Var, Boolean.FALSE);
        return o36Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            o36 o36Var = (o36) it;
            if (o36Var.hasNext()) {
                sb.append(((Map.Entry) o36Var.next()).toString());
                if (o36Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
