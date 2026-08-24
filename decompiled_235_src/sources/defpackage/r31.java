package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r31  reason: default package */
/* loaded from: classes.dex */
public final class r31 implements q31, s31 {
    public final /* synthetic */ int A = 0;
    public ClipData B;
    public int L;
    public int R;
    public Uri X;
    public Bundle Y;

    public r31(r31 r31Var) {
        ClipData clipData = r31Var.B;
        clipData.getClass();
        this.B = clipData;
        int i = r31Var.L;
        np2.u(i, 0, 5, "source");
        this.L = i;
        int i2 = r31Var.R;
        if ((i2 & 1) == i2) {
            this.R = i2;
            this.X = r31Var.X;
            this.Y = r31Var.Y;
            return;
        }
        String hexString = Integer.toHexString(i2);
        String hexString2 = Integer.toHexString(1);
        throw new IllegalArgumentException("Requested flags 0x" + hexString + ", but only 0x" + hexString2 + " are allowed");
    }

    @Override // defpackage.s31
    public int F() {
        return this.R;
    }

    @Override // defpackage.s31
    public ContentInfo G() {
        return null;
    }

    @Override // defpackage.q31
    public t31 build() {
        return new t31(new r31(this));
    }

    @Override // defpackage.s31
    public int k() {
        return this.L;
    }

    @Override // defpackage.s31
    public ClipData l() {
        return this.B;
    }

    @Override // defpackage.q31
    public void s(Uri uri) {
        this.X = uri;
    }

    @Override // defpackage.q31
    public void setExtras(Bundle bundle) {
        this.Y = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.A) {
            case 1:
                Uri uri = this.X;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.B.getDescription());
                sb.append(", source=");
                int i = this.L;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
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
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.R;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.Y != null) {
                    str3 = ", hasExtras";
                }
                return i61.n(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.q31
    public void v(int i) {
        this.R = i;
    }

    public /* synthetic */ r31() {
    }
}
