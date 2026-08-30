package j7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f7486a;

    /* renamed from: b  reason: collision with root package name */
    public int f7487b;

    /* renamed from: c  reason: collision with root package name */
    public Object f7488c;

    /* renamed from: d  reason: collision with root package name */
    public int f7489d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i2 = this.f7486a;
                if (i2 == aVar.f7486a) {
                    if (i2 != 8 || Math.abs(this.f7489d - this.f7487b) != 1 || this.f7489d != aVar.f7487b || this.f7487b != aVar.f7489d) {
                        if (this.f7489d == aVar.f7489d && this.f7487b == aVar.f7487b) {
                            Object obj2 = this.f7488c;
                            Object obj3 = aVar.f7488c;
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
        return (((this.f7486a * 31) + this.f7487b) * 31) + this.f7489d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i2 = this.f7486a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
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
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f7487b);
        sb2.append("c:");
        sb2.append(this.f7489d);
        sb2.append(",p:");
        sb2.append(this.f7488c);
        sb2.append("]");
        return sb2.toString();
    }
}
