package a6;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d, f {
    public final /* synthetic */ int A = 0;
    public ClipData B;
    public int L;
    public int R;
    public Uri X;
    public Bundle Y;

    public e(e eVar) {
        ClipData clipData = eVar.B;
        clipData.getClass();
        this.B = clipData;
        int i2 = eVar.L;
        p7.m.i("source", i2, 0, 5);
        this.L = i2;
        int i10 = eVar.R;
        if ((i10 & 1) == i10) {
            this.R = i10;
            this.X = eVar.X;
            this.Y = eVar.Y;
            return;
        }
        String hexString = Integer.toHexString(i10);
        String hexString2 = Integer.toHexString(1);
        throw new IllegalArgumentException("Requested flags 0x" + hexString + ", but only 0x" + hexString2 + " are allowed");
    }

    @Override // a6.f
    public int G() {
        return this.R;
    }

    @Override // a6.f
    public ContentInfo H() {
        return null;
    }

    @Override // a6.d
    public void K(Uri uri) {
        this.X = uri;
    }

    @Override // a6.d
    public void M(int i2) {
        this.R = i2;
    }

    @Override // a6.d
    public g build() {
        return new g(new e(this));
    }

    @Override // a6.f
    public int j() {
        return this.L;
    }

    @Override // a6.f
    public ClipData q() {
        return this.B;
    }

    @Override // a6.d
    public void setExtras(Bundle bundle) {
        this.Y = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                Uri uri = this.X;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.B.getDescription());
                sb2.append(", source=");
                int i2 = this.L;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        str = String.valueOf(i2);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i10 = this.R;
                if ((i10 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sb2.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.Y != null) {
                    str3 = ", hasExtras";
                }
                return w.d.s(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e() {
    }
}
