package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f33  reason: default package */
/* loaded from: classes.dex */
public final class f33 {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        iq2.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
