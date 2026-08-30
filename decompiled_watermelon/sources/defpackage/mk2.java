package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mk2  reason: default package */
/* loaded from: classes.dex */
public final class mk2 {
    public int a;

    public mk2(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return wh1.m(sb, this.a, " }");
    }
}
