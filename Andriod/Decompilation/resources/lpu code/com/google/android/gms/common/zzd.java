package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.common.internal.safeparcel.zzb.zza;

public class zzd
  implements Parcelable.Creator<zzc>
{
  static void zza(zzc paramzzc, Parcel paramParcel, int paramInt)
  {
    paramInt = com.google.android.gms.common.internal.safeparcel.zzc.zzaZ(paramParcel);
    com.google.android.gms.common.internal.safeparcel.zzc.zza(paramParcel, 1, paramzzc.name, false);
    com.google.android.gms.common.internal.safeparcel.zzc.zzc(paramParcel, 2, paramzzc.version);
    com.google.android.gms.common.internal.safeparcel.zzc.zzJ(paramParcel, paramInt);
  }
  
  public zzc zzaK(Parcel paramParcel)
  {
    int j = zzb.zzaY(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = zzb.zzaX(paramParcel);
      switch (zzb.zzdc(k))
      {
      default: 
        zzb.zzb(paramParcel, k);
        break;
      case 1: 
        str = zzb.zzq(paramParcel, k);
        break;
      case 2: 
        i = zzb.zzg(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zzb.zza(37 + "Overread allowed size end=" + j, paramParcel);
    }
    return new zzc(str, i);
  }
  
  public zzc[] zzcv(int paramInt)
  {
    return new zzc[paramInt];
  }
}


/* Location:              C:\Users\ankit\Documents\GitHub\code-with-ankit\Andriod\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\zzd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */