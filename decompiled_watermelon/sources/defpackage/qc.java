package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qc  reason: default package */
/* loaded from: classes.dex */
public final class qc extends yf2 {
    public final int e;

    public qc(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qc) && ((qc) obj).e == this.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e * 31;
    }
}
