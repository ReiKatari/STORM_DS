package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj1  reason: default package */
/* loaded from: classes.dex */
public final class zj1 extends b9 {
    public final /* synthetic */ int a;
    public final sv4 b;

    public zj1(sv4 sv4Var, int i) {
        this.a = i;
        sv4Var.getClass();
        switch (i) {
            case 1:
                this.b = sv4Var;
                return;
            default:
                this.b = sv4Var;
                return;
        }
    }

    @Override // defpackage.b9
    public final Intent a(Context context, Object obj) {
        Object obj2;
        int i = this.a;
        sv4 sv4Var = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.addFlags(sv4Var.toFlags() | 192);
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            default:
                vr4 vr4Var = (vr4) obj;
                vr4Var.getClass();
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                String[] strArr = (String[]) vr4Var.B;
                if (strArr == null) {
                    strArr = new String[]{"*/*"};
                }
                Intent addFlags = intent2.putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*").addCategory("android.intent.category.OPENABLE").addFlags(sv4Var.toFlags());
                addFlags.getClass();
                if (Build.VERSION.SDK_INT >= 26 && (obj2 = vr4Var.A) != null) {
                    addFlags.putExtra("android.provider.extra.INITIAL_URI", (Parcelable) obj2);
                }
                return addFlags;
        }
    }

    @Override // defpackage.b9
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
}
