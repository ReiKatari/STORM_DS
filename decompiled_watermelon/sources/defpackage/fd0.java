package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fd0  reason: default package */
/* loaded from: classes.dex */
public final class fd0 {
    public final bd0 a;
    public final Map b;

    public fd0(bd0 bd0Var, Map map) {
        this.a = bd0Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fd0) {
                fd0 fd0Var = (fd0) obj;
                if (!this.a.equals(fd0Var.a) || !this.b.equals(fd0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.a + ", streamConfigMap=" + this.b + ')';
    }
}
