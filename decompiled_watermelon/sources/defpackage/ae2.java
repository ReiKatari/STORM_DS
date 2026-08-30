package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ae2  reason: default package */
/* loaded from: classes.dex */
public final class ae2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ae2(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        int i2 = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                Object[] objArr = {(xd2) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return ce2.b(str, context, Collections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return ce2.b(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new be2(-3);
                }
        }
    }
}
