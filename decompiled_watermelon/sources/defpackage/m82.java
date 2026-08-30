package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Locale;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m82  reason: default package */
/* loaded from: classes.dex */
public abstract class m82 extends xp {
    @Override // androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        IconCompat b;
        super.onCreate(bundle);
        ConsoleType z = z();
        String packageName = getPackageName();
        Intent intent = new Intent(packageName + ".LAUNCH_FIRMWARE");
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", z.ordinal());
        String lowerCase = z.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ka kaVar = new ka(10, false);
        kaVar.B = this;
        kaVar.L = lowerCase;
        int[] iArr = l82.a;
        int i = iArr[z.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = getString(R.string.console_dsi_full);
                string.getClass();
            } else {
                i.c();
                return;
            }
        } else {
            string = getString(R.string.console_ds_full);
            string.getClass();
        }
        kaVar.X = string;
        int i2 = iArr[z.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                b = IconCompat.b(this, R.mipmap.ic_platform_dsi);
            } else {
                i.c();
                return;
            }
        } else {
            b = IconCompat.b(this, R.mipmap.ic_platform_ds);
        }
        kaVar.Y = b;
        kaVar.R = new Intent[]{intent};
        if (!TextUtils.isEmpty((CharSequence) kaVar.X)) {
            Intent[] intentArr = (Intent[]) kaVar.R;
            if (intentArr != null && intentArr.length != 0) {
                setResult(-1, oo2.z(this, kaVar));
                finish();
                return;
            }
            i.i("Shortcut must have an intent");
            return;
        }
        i.i("Shortcut must have a non-empty label");
    }

    public abstract ConsoleType z();
}
