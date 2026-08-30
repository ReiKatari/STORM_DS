package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m01  reason: default package */
/* loaded from: classes.dex */
public final class m01 implements l01, n01 {
    public final /* synthetic */ int A = 0;
    public ClipData B;
    public int L;
    public int R;
    public Uri X;
    public Bundle Y;

    public m01(m01 m01Var) {
        ClipData clipData = m01Var.B;
        clipData.getClass();
        this.B = clipData;
        int i = m01Var.L;
        nl2.A("source", i, 0, 5);
        this.L = i;
        int i2 = m01Var.R;
        if ((i2 & 1) == i2) {
            this.R = i2;
            this.X = m01Var.X;
            this.Y = m01Var.Y;
            return;
        }
        String hexString = Integer.toHexString(i2);
        String hexString2 = Integer.toHexString(1);
        throw new IllegalArgumentException("Requested flags 0x" + hexString + ", but only 0x" + hexString2 + " are allowed");
    }

    @Override // defpackage.n01
    public int A() {
        return this.R;
    }

    @Override // defpackage.n01
    public ContentInfo B() {
        return null;
    }

    @Override // defpackage.l01
    public void F(Uri uri) {
        this.X = uri;
    }

    @Override // defpackage.l01
    public void N(int i) {
        this.R = i;
    }

    @Override // defpackage.l01
    public o01 build() {
        return new o01(new m01(this));
    }

    @Override // defpackage.n01
    public int j() {
        return this.L;
    }

    @Override // defpackage.n01
    public ClipData m() {
        return this.B;
    }

    @Override // defpackage.l01
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
                return b31.q(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m01() {
    }
}
