package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x9  reason: default package */
/* loaded from: classes.dex */
public final class x9 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x9) {
                x9 x9Var = (x9) obj;
                int i = this.a;
                if (i == x9Var.a) {
                    if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != x9Var.b || this.b != x9Var.d) {
                        if (this.d == x9Var.d && this.b == x9Var.b) {
                            Object obj2 = this.c;
                            Object obj3 = x9Var.c;
                            if (obj2 != null) {
                                if (!obj2.equals(obj3)) {
                                    return false;
                                }
                            } else if (obj3 != null) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
