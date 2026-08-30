package vd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.fragment.app.o0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import sd.f;
import yb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends i.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13790a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13791b;

    public a(f fVar, int i2) {
        this.f13790a = i2;
        fVar.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f13791b = fVar;
                return;
            default:
                this.f13791b = fVar;
                return;
        }
    }

    @Override // i.a
    public final Intent a(o0 o0Var, Object obj) {
        Object obj2;
        switch (this.f13790a) {
            case 0:
                return d(o0Var, (Uri) obj);
            default:
                j jVar = (j) obj;
                jVar.getClass();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                String[] strArr = (String[]) jVar.B;
                if (strArr == null) {
                    strArr = new String[]{"*/*"};
                }
                Intent addFlags = intent.putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*").addCategory("android.intent.category.OPENABLE").addFlags(this.f13791b.toFlags());
                addFlags.getClass();
                if (Build.VERSION.SDK_INT >= 26 && (obj2 = jVar.A) != null) {
                    addFlags.putExtra("android.provider.extra.INITIAL_URI", (Parcelable) obj2);
                }
                return addFlags;
        }
    }

    @Override // i.a
    public final Object c(Intent intent, int i2) {
        switch (this.f13790a) {
            case 0:
                if (intent != null && i2 == -1) {
                    return intent.getData();
                }
                return null;
            default:
                if (intent != null && i2 == -1) {
                    return intent.getData();
                }
                return null;
        }
    }

    public Intent d(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.addFlags(this.f13791b.toFlags() | 192);
        if (Build.VERSION.SDK_INT >= 26 && uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }
}
