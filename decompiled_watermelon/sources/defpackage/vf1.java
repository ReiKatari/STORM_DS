package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.fragment.app.p;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf1  reason: default package */
/* loaded from: classes.dex */
public final class vf1 extends a9 {
    public final /* synthetic */ int a;
    public final nm4 b;

    public vf1(nm4 nm4Var, int i) {
        this.a = i;
        nm4Var.getClass();
        switch (i) {
            case 1:
                this.b = nm4Var;
                return;
            default:
                this.b = nm4Var;
                return;
        }
    }

    @Override // defpackage.a9
    public final Intent a(p pVar, Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                return d(pVar, (Uri) obj);
            default:
                ti4 ti4Var = (ti4) obj;
                ti4Var.getClass();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                String[] strArr = (String[]) ti4Var.B;
                if (strArr == null) {
                    strArr = new String[]{"*/*"};
                }
                Intent addFlags = intent.putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*").addCategory("android.intent.category.OPENABLE").addFlags(this.b.toFlags());
                addFlags.getClass();
                if (Build.VERSION.SDK_INT >= 26 && (obj2 = ti4Var.A) != null) {
                    addFlags.putExtra("android.provider.extra.INITIAL_URI", (Parcelable) obj2);
                }
                return addFlags;
        }
    }

    @Override // defpackage.a9
    public final Object c(Intent intent, int i) {
        switch (this.a) {
            case 0:
                if (intent == null || i != -1) {
                    return null;
                }
                return intent.getData();
            default:
                if (intent == null || i != -1) {
                    return null;
                }
                return intent.getData();
        }
    }

    public Intent d(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(this.b.toFlags() | 192);
        if (Build.VERSION.SDK_INT >= 26 && uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }
}
