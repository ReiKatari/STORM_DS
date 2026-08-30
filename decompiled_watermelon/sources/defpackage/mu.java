package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mu  reason: default package */
/* loaded from: classes.dex */
public final class mu implements b06 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mu(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new v0((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new jo3(this);
            case 3:
                return (Iterator) obj;
            case 4:
                return new io3((CharSequence) obj);
            default:
                return new v0(10, (ViewGroup) obj);
        }
    }
}
