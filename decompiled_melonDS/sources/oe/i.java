package oe;

import java.util.Arrays;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ConsoleType f10936a;

    /* renamed from: b  reason: collision with root package name */
    public final h f10937b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f10938c;

    /* renamed from: d  reason: collision with root package name */
    public final yb.j[] f10939d;

    public i(ConsoleType consoleType, h hVar, String[] strArr, yb.j[] jVarArr) {
        consoleType.getClass();
        hVar.getClass();
        strArr.getClass();
        jVarArr.getClass();
        this.f10936a = consoleType;
        this.f10937b = hVar;
        this.f10938c = strArr;
        this.f10939d = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f10936a == iVar.f10936a && this.f10937b == iVar.f10937b && nc.k.a(this.f10938c, iVar.f10938c) && nc.k.a(this.f10939d, iVar.f10939d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10937b.hashCode() + (this.f10936a.hashCode() * 31)) * 31) + Arrays.hashCode(this.f10938c)) * 31) + Arrays.hashCode(this.f10939d);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f10938c);
        String arrays2 = Arrays.toString(this.f10939d);
        return "ConfigurationDirResult(consoleType=" + this.f10936a + ", status=" + this.f10937b + ", requiredFiles=" + arrays + ", fileResults=" + arrays2 + ")";
    }
}
