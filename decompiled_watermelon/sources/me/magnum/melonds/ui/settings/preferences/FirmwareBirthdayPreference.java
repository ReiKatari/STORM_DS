package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class FirmwareBirthdayPreference extends Preference {
    public static final Map A = zt3.l0(new ti4(1, 31), new ti4(2, 29), new ti4(3, 31), new ti4(4, 30), new ti4(5, 31), new ti4(6, 30), new ti4(7, 31), new ti4(8, 31), new ti4(9, 30), new ti4(10, 31), new ti4(11, 30), new ti4(12, 31));
    public static final NumberFormat B;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumIntegerDigits(2);
        B = numberInstance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareBirthdayPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public static int e(int i, boolean z, int i2) {
        int i3;
        Integer num = (Integer) A.get(Integer.valueOf(i2));
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 1;
        }
        if (z) {
            if (i > i3) {
                return 1;
            }
            if (i < 1) {
                return i3;
            }
            return i;
        }
        return io2.m(i, 1, i3);
    }

    public static void f(TextView textView, int i) {
        textView.setText(B.format(Integer.valueOf(i)).toString());
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [k91, java.lang.Object] */
    @Override // androidx.preference.Preference
    public final void onClick() {
        int i;
        int i2;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_birthday, (ViewGroup) null, false);
        int i3 = R.id.buttonBirthdayDayDecrease;
        Button button = (Button) ep2.r(inflate, R.id.buttonBirthdayDayDecrease);
        if (button != null) {
            i3 = R.id.buttonBirthdayDayIncrease;
            Button button2 = (Button) ep2.r(inflate, R.id.buttonBirthdayDayIncrease);
            if (button2 != null) {
                i3 = R.id.buttonBirthdayMonthDecrease;
                Button button3 = (Button) ep2.r(inflate, R.id.buttonBirthdayMonthDecrease);
                if (button3 != null) {
                    i3 = R.id.buttonBirthdayMonthIncrease;
                    Button button4 = (Button) ep2.r(inflate, R.id.buttonBirthdayMonthIncrease);
                    if (button4 != null) {
                        i3 = R.id.textBirthdayDay;
                        TextView textView = (TextView) ep2.r(inflate, R.id.textBirthdayDay);
                        if (textView != null) {
                            i3 = R.id.textBirthdayMonth;
                            TextView textView2 = (TextView) ep2.r(inflate, R.id.textBirthdayMonth);
                            if (textView2 != null) {
                                final ?? obj = new Object();
                                obj.A = textView;
                                obj.B = textView2;
                                sb sbVar = new sb(getContext());
                                ((pb) sbVar.L).d = getTitle();
                                sbVar.B((ConstraintLayout) inflate);
                                sbVar.z(R.string.ok, new aq1(1, obj, this));
                                sbVar.x(R.string.cancel, new hm0(2));
                                sbVar.C();
                                String persistedString = getPersistedString("01/01");
                                persistedString.getClass();
                                List Q0 = zg6.Q0(persistedString, new String[]{"/"});
                                if (Q0.size() != 2) {
                                    f(textView, 1);
                                    f(textView2, 1);
                                } else {
                                    Integer o0 = gh6.o0((String) Q0.get(0));
                                    if (o0 != null) {
                                        i = o0.intValue();
                                    } else {
                                        i = 1;
                                    }
                                    f(textView, i);
                                    Integer o02 = gh6.o0((String) Q0.get(1));
                                    if (o02 != null) {
                                        i2 = o02.intValue();
                                    } else {
                                        i2 = 1;
                                    }
                                    f(textView2, i2);
                                }
                                button2.setOnClickListener(new View.OnClickListener(obj, this, 0) { // from class: z72
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ k91 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        k91 k91Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) k91Var.A;
                                                Integer o03 = gh6.o0(textView3.getText().toString());
                                                if (o03 != null) {
                                                    i12 = o03.intValue();
                                                }
                                                Integer o04 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o04 != null) {
                                                    i4 = o04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) k91Var.A;
                                                Integer o05 = gh6.o0(textView4.getText().toString());
                                                if (o05 != null) {
                                                    i11 = o05.intValue();
                                                }
                                                Integer o06 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o06 != null) {
                                                    i5 = o06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) k91Var.A;
                                                TextView textView6 = (TextView) k91Var.B;
                                                Integer o07 = gh6.o0(textView5.getText().toString());
                                                if (o07 != null) {
                                                    i6 = o07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer o08 = gh6.o0(textView6.getText().toString());
                                                if (o08 != null) {
                                                    i7 = o08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) k91Var.A;
                                                TextView textView8 = (TextView) k91Var.B;
                                                Integer o09 = gh6.o0(textView7.getText().toString());
                                                if (o09 != null) {
                                                    i8 = o09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer o010 = gh6.o0(textView8.getText().toString());
                                                if (o010 != null) {
                                                    i11 = o010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener(obj, this, 1) { // from class: z72
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ k91 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        k91 k91Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) k91Var.A;
                                                Integer o03 = gh6.o0(textView3.getText().toString());
                                                if (o03 != null) {
                                                    i12 = o03.intValue();
                                                }
                                                Integer o04 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o04 != null) {
                                                    i4 = o04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) k91Var.A;
                                                Integer o05 = gh6.o0(textView4.getText().toString());
                                                if (o05 != null) {
                                                    i11 = o05.intValue();
                                                }
                                                Integer o06 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o06 != null) {
                                                    i5 = o06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) k91Var.A;
                                                TextView textView6 = (TextView) k91Var.B;
                                                Integer o07 = gh6.o0(textView5.getText().toString());
                                                if (o07 != null) {
                                                    i6 = o07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer o08 = gh6.o0(textView6.getText().toString());
                                                if (o08 != null) {
                                                    i7 = o08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) k91Var.A;
                                                TextView textView8 = (TextView) k91Var.B;
                                                Integer o09 = gh6.o0(textView7.getText().toString());
                                                if (o09 != null) {
                                                    i8 = o09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer o010 = gh6.o0(textView8.getText().toString());
                                                if (o010 != null) {
                                                    i11 = o010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button4.setOnClickListener(new View.OnClickListener(obj, this, 2) { // from class: z72
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ k91 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        k91 k91Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) k91Var.A;
                                                Integer o03 = gh6.o0(textView3.getText().toString());
                                                if (o03 != null) {
                                                    i12 = o03.intValue();
                                                }
                                                Integer o04 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o04 != null) {
                                                    i4 = o04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) k91Var.A;
                                                Integer o05 = gh6.o0(textView4.getText().toString());
                                                if (o05 != null) {
                                                    i11 = o05.intValue();
                                                }
                                                Integer o06 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o06 != null) {
                                                    i5 = o06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) k91Var.A;
                                                TextView textView6 = (TextView) k91Var.B;
                                                Integer o07 = gh6.o0(textView5.getText().toString());
                                                if (o07 != null) {
                                                    i6 = o07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer o08 = gh6.o0(textView6.getText().toString());
                                                if (o08 != null) {
                                                    i7 = o08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) k91Var.A;
                                                TextView textView8 = (TextView) k91Var.B;
                                                Integer o09 = gh6.o0(textView7.getText().toString());
                                                if (o09 != null) {
                                                    i8 = o09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer o010 = gh6.o0(textView8.getText().toString());
                                                if (o010 != null) {
                                                    i11 = o010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button3.setOnClickListener(new View.OnClickListener(obj, this, 3) { // from class: z72
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ k91 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        k91 k91Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) k91Var.A;
                                                Integer o03 = gh6.o0(textView3.getText().toString());
                                                if (o03 != null) {
                                                    i12 = o03.intValue();
                                                }
                                                Integer o04 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o04 != null) {
                                                    i4 = o04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) k91Var.A;
                                                Integer o05 = gh6.o0(textView4.getText().toString());
                                                if (o05 != null) {
                                                    i11 = o05.intValue();
                                                }
                                                Integer o06 = gh6.o0(((TextView) k91Var.B).getText().toString());
                                                if (o06 != null) {
                                                    i5 = o06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) k91Var.A;
                                                TextView textView6 = (TextView) k91Var.B;
                                                Integer o07 = gh6.o0(textView5.getText().toString());
                                                if (o07 != null) {
                                                    i6 = o07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer o08 = gh6.o0(textView6.getText().toString());
                                                if (o08 != null) {
                                                    i7 = o08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) k91Var.A;
                                                TextView textView8 = (TextView) k91Var.B;
                                                Integer o09 = gh6.o0(textView7.getText().toString());
                                                if (o09 != null) {
                                                    i8 = o09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer o010 = gh6.o0(textView8.getText().toString());
                                                if (o010 != null) {
                                                    i11 = o010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }
}
