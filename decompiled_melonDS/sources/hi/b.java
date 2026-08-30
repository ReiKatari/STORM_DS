package hi;

import a0.j;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Locale;
import l.i;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.ConsoleType;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b extends i {
    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        IconCompat b10;
        super.onCreate(bundle);
        ConsoleType z10 = z();
        String packageName = getPackageName();
        Intent intent = new Intent(packageName + ".LAUNCH_FIRMWARE");
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", z10.ordinal());
        String lowerCase = z10.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        x0 x0Var = new x0(6);
        x0Var.f14089b = this;
        x0Var.f14090c = lowerCase;
        int[] iArr = a.f6591a;
        int i2 = iArr[z10.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                string = getString(R.string.console_dsi_full);
                string.getClass();
            } else {
                o.o();
                return;
            }
        } else {
            string = getString(R.string.console_ds_full);
            string.getClass();
        }
        x0Var.f14092e = string;
        int i10 = iArr[z10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                b10 = IconCompat.b(this, R.mipmap.ic_platform_dsi);
            } else {
                o.o();
                return;
            }
        } else {
            b10 = IconCompat.b(this, R.mipmap.ic_platform_ds);
        }
        x0Var.f14093f = b10;
        x0Var.f14091d = new Intent[]{intent};
        if (!TextUtils.isEmpty((CharSequence) x0Var.f14092e)) {
            Intent[] intentArr = (Intent[]) x0Var.f14091d;
            if (intentArr != null && intentArr.length != 0) {
                setResult(-1, a.a.p(this, x0Var));
                finish();
                return;
            }
            j.h("Shortcut must have an intent");
            return;
        }
        j.h("Shortcut must have a non-empty label");
    }

    public abstract ConsoleType z();
}
