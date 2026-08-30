package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fu4  reason: default package */
/* loaded from: classes.dex */
public final class fu4 {
    public final int a;

    public fu4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fu4)) {
            return false;
        }
        if (this.a != ((fu4) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
